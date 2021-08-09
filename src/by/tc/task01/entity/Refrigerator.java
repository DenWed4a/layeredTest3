package by.tc.task01.entity;

public class Refrigerator implements Appliance {
	// you may add your own code here

	private final int powerConsumption;
	private final int weight;
	private final int freezerCapacity;
	private final double overallCapacity;
	private final int height;
	private final int width;

	private Refrigerator(Builder builder) {
		this.powerConsumption = builder.powerConsumption;
		this.weight = builder.weight;
		this.freezerCapacity = builder.freezerCapacity;
		this.overallCapacity = builder.overallCapacity;
		this.height = builder.height;
		this.width = builder.width;
	}

	public static class Builder {
		private int powerConsumption;
		private int weight;
		private int freezerCapacity;
		private double overallCapacity;
		private int height;
		private int width;

		public Builder powerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder freezerCapacity(int freezerCapacity) {
			this.freezerCapacity = freezerCapacity;
			return this;
		}

		public Builder overallCapacity(double overallCapacity) {
			this.overallCapacity = overallCapacity;
			return this;
		}

		public Builder height(int height) {
			this.height = height;
			return this;
		}

		public Builder width(int width) {
			this.width = width;
			return this;
		}

		public Refrigerator build() {
			return new Refrigerator(this);
		}
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + freezerCapacity;
		result = prime * result + height;
		long temp;
		temp = Double.doubleToLongBits(overallCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

}
