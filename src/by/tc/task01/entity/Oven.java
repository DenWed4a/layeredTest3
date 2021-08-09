package by.tc.task01.entity;

public class Oven implements Appliance {
	private final int powerConsumption;
	private final int weight;
	private final int capacity;
	private final int depth;
	private final double height;
	private final double width;

	private Oven(Builder builder) {
		this.powerConsumption = builder.powerConsumption;
		this.weight = builder.weight;
		this.capacity = builder.capacity;
		this.depth = builder.depth;
		this.height = builder.height;
		this.width = builder.width;
	}

	public static class Builder {
		private int powerConsumption;
		private int weight;
		private int capacity;
		private int depth;
		private double height;
		private double width;

		public Builder powerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder capacity(int capacity) {
			this.capacity = capacity;
			return this;
		}

		public Builder depth(int depth) {
			this.depth = depth;
			return this;
		}

		public Builder height(double height) {
			this.height = height;
			return this;
		}

		public Builder width(double width) {
			this.width = width;
			return this;
		}
		
		public Oven build() {
			return new Oven(this);
		}

	}
	
	

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getDepth() {
		return depth;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + depth;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (depth != other.depth)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}


}
