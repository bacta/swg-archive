package com.ocdsoft.bacta.swg.server.game.object.template.shared;

import bacta.iff.Iff;
import com.google.common.base.Preconditions;
import com.ocdsoft.bacta.swg.shared.foundation.DataResourceList;
import com.ocdsoft.bacta.swg.shared.foundation.Tag;
import com.ocdsoft.bacta.swg.shared.template.ObjectTemplate;
import com.ocdsoft.bacta.swg.shared.template.definition.TemplateDefinition;
import com.ocdsoft.bacta.swg.shared.utility.FloatParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generated by the TemplateDefinitionWriter.
 * MANUAL MODIFICATIONS MAY BE OVERWRITTEN.
 */
@TemplateDefinition
public class SharedVehicleObjectTemplate extends SharedTangibleObjectTemplate {
	private static final Logger LOGGER = LoggerFactory.getLogger(SharedVehicleObjectTemplate.class);
	public static final int TAG_SHAREDVEHICLEOBJECTTEMPLATE = Tag.convertStringToTag("SVOT");

	private static void registerTemplateConstructors(final DataResourceList<ObjectTemplate> objectTemplateList) {
		objectTemplateList.registerTemplate(SharedVehicleObjectTemplate.TAG_SHAREDVEHICLEOBJECTTEMPLATE, SharedVehicleObjectTemplate::new);
	}

	private int templateVersion;

	private final FloatParam[] speed = new FloatParam[]{ //how fast the vehicle moves
			new FloatParam(),
			new FloatParam(),
			new FloatParam(),
			new FloatParam(),
			new FloatParam(),
	};
	private final FloatParam slopeAversion = new FloatParam(); //?
	private final FloatParam hoverValue = new FloatParam(); //height vehicle hovers at
	private final FloatParam turnRate = new FloatParam(); //how tight the vehicle turns (?)
	private final FloatParam maxVelocity = new FloatParam(); //max speed the vehicle can move
	private final FloatParam acceleration = new FloatParam(); //vehicle acceleration
	private final FloatParam braking = new FloatParam(); //vehicle braking

	public SharedVehicleObjectTemplate(final String filename, final DataResourceList<ObjectTemplate> objectTemplateList) {
		super(filename, objectTemplateList);
	}

	@Override
	public int getId() {
		return TAG_SHAREDVEHICLEOBJECTTEMPLATE;
	}

	public float getSpeed(MovementTypes index) {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!speed[(int) index.value].isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSpeed(index);
			}
		}

		float value = this.speed[(int) index.value].getValue();
		final byte delta = this.speed[(int) index.value].getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSpeed(index);
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getSpeedMin(MovementTypes index) {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!speed[(int) index.value].isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSpeedMin(index);
			}
		}

		float value = this.speed[(int) index.value].getMinValue();
		final byte delta = this.speed[(int) index.value].getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSpeedMin(index);
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getSpeedMax(MovementTypes index) {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!speed[(int) index.value].isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSpeedMax(index);
			}
		}

		float value = this.speed[(int) index.value].getMaxValue();
		final byte delta = this.speed[(int) index.value].getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSpeedMax(index);
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getSlopeAversion() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!slopeAversion.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSlopeAversion();
			}
		}

		float value = this.slopeAversion.getValue();
		final byte delta = this.slopeAversion.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSlopeAversion();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getSlopeAversionMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!slopeAversion.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSlopeAversionMin();
			}
		}

		float value = this.slopeAversion.getMinValue();
		final byte delta = this.slopeAversion.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSlopeAversionMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getSlopeAversionMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!slopeAversion.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getSlopeAversionMax();
			}
		}

		float value = this.slopeAversion.getMaxValue();
		final byte delta = this.slopeAversion.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getSlopeAversionMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getHoverValue() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!hoverValue.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getHoverValue();
			}
		}

		float value = this.hoverValue.getValue();
		final byte delta = this.hoverValue.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getHoverValue();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getHoverValueMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!hoverValue.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getHoverValueMin();
			}
		}

		float value = this.hoverValue.getMinValue();
		final byte delta = this.hoverValue.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getHoverValueMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getHoverValueMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!hoverValue.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getHoverValueMax();
			}
		}

		float value = this.hoverValue.getMaxValue();
		final byte delta = this.hoverValue.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getHoverValueMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getTurnRate() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!turnRate.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getTurnRate();
			}
		}

		float value = this.turnRate.getValue();
		final byte delta = this.turnRate.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getTurnRate();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getTurnRateMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!turnRate.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getTurnRateMin();
			}
		}

		float value = this.turnRate.getMinValue();
		final byte delta = this.turnRate.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getTurnRateMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getTurnRateMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!turnRate.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getTurnRateMax();
			}
		}

		float value = this.turnRate.getMaxValue();
		final byte delta = this.turnRate.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getTurnRateMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getMaxVelocity() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!maxVelocity.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getMaxVelocity();
			}
		}

		float value = this.maxVelocity.getValue();
		final byte delta = this.maxVelocity.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getMaxVelocity();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getMaxVelocityMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!maxVelocity.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getMaxVelocityMin();
			}
		}

		float value = this.maxVelocity.getMinValue();
		final byte delta = this.maxVelocity.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getMaxVelocityMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getMaxVelocityMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!maxVelocity.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getMaxVelocityMax();
			}
		}

		float value = this.maxVelocity.getMaxValue();
		final byte delta = this.maxVelocity.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getMaxVelocityMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getAcceleration() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!acceleration.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getAcceleration();
			}
		}

		float value = this.acceleration.getValue();
		final byte delta = this.acceleration.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getAcceleration();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getAccelerationMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!acceleration.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getAccelerationMin();
			}
		}

		float value = this.acceleration.getMinValue();
		final byte delta = this.acceleration.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getAccelerationMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getAccelerationMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!acceleration.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getAccelerationMax();
			}
		}

		float value = this.acceleration.getMaxValue();
		final byte delta = this.acceleration.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getAccelerationMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getBraking() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!braking.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getBraking();
			}
		}

		float value = this.braking.getValue();
		final byte delta = this.braking.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getBraking();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getBrakingMin() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!braking.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getBrakingMin();
			}
		}

		float value = this.braking.getMinValue();
		final byte delta = this.braking.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getBrakingMin();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	public float getBrakingMax() {
		SharedVehicleObjectTemplate base = null;

		if (baseData instanceof SharedVehicleObjectTemplate)
			base = (SharedVehicleObjectTemplate) baseData;

		if (!braking.isLoaded()) {
			if (base == null) {
				return 0.0f;
			} else {
				return base.getBrakingMax();
			}
		}

		float value = this.braking.getMaxValue();
		final byte delta = this.braking.getDeltaType();

		if (delta == '+' || delta == '-' || delta == '_' || delta == '=') {
			float baseValue = 0;

			if (baseData != null) {
				if (base != null)
					baseValue = base.getBrakingMax();
			}

			if (delta == '+')
				value = baseValue + value;
			if (delta == '-')
				value = baseValue - value;
			if (delta == '=')
				value = baseValue + (float) (baseValue * (value / 100.0f));
			if (delta == '_')
				value = baseValue - (float) (baseValue * (value / 100.0f));
		}
		return value;
	}

	@Override
	protected void load(final Iff iff) {
		if (iff.getCurrentName() != TAG_SHAREDVEHICLEOBJECTTEMPLATE) {
			super.load(iff);
			return;
		}

		iff.enterForm();
		templateVersion = iff.getCurrentName();

		if (templateVersion == Tag.TAG_DERV) {
			iff.enterForm();
			iff.enterChunk();
			final String baseFilename = iff.readString();
			iff.exitChunk();
			final ObjectTemplate base = objectTemplateList.fetch(baseFilename);
			Preconditions.checkNotNull(base, "was unable to load base template %s", baseFilename);
			if (baseData == base && base != null) {
				base.releaseReference();
			} else {
				if (baseData != null)
					baseData.releaseReference();
				baseData = base;
			}
			iff.exitForm();
			templateVersion = iff.getCurrentName();
		}

		iff.enterForm();
		iff.enterChunk();
		final int paramCount = iff.readInt();
		iff.exitChunk();
		for (int i = 0; i < paramCount; ++i) {
			iff.enterChunk();
			final String parameterName = iff.readString();

			if ("speed".equalsIgnoreCase(parameterName)) {
				int listCount = iff.readInt();
				int j;
				for (j = 0; j < 5 && j < listCount; ++j)
					speed[j].loadFromIff(objectTemplateList, iff);
				for (; j < listCount; ++j) {
					final FloatParam dummy = new FloatParam();
					dummy.loadFromIff(objectTemplateList, iff);
				}
			} else if ("slopeAversion".equalsIgnoreCase(parameterName)) {
				slopeAversion.loadFromIff(objectTemplateList, iff);
			} else if ("hoverValue".equalsIgnoreCase(parameterName)) {
				hoverValue.loadFromIff(objectTemplateList, iff);
			} else if ("turnRate".equalsIgnoreCase(parameterName)) {
				turnRate.loadFromIff(objectTemplateList, iff);
			} else if ("maxVelocity".equalsIgnoreCase(parameterName)) {
				maxVelocity.loadFromIff(objectTemplateList, iff);
			} else if ("acceleration".equalsIgnoreCase(parameterName)) {
				acceleration.loadFromIff(objectTemplateList, iff);
			} else if ("braking".equalsIgnoreCase(parameterName)) {
				braking.loadFromIff(objectTemplateList, iff);
			} else {
				LOGGER.trace("Unexpected parameter {}", parameterName);
			}

			iff.exitChunk();
		}
		iff.exitForm();

		super.load(iff);
		iff.exitForm();
	}

	public enum MovementTypes {
		MT_hover(0), 
		MT_underwater(1), 
		MT_ground(2),
		MT_swim(3),
		MT_walker(4), 
		MovementTypes_Last(MT_walker.value);

		private static final MovementTypes[] values = values();
		public final long value;

		MovementTypes(final long value) {
			this.value = value;
		}
		public static MovementTypes from(final long value) {
			for (final MovementTypes e : values)
				if (e.value == value) return e;
			throw new IllegalArgumentException(String.format("UNKNOWN value %d for enum MovementTypes", value));
		}
	}

}

