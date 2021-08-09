package by.tc.task01.entity;

public class Speakers implements Appliance {
	private final int powerConsumption;
	private final int numberOfSpeakers;
	private final String frequencyRange;
	private final int cordLength;

	private Speakers(Builder builder) {
		this.powerConsumption = builder.powerConsumption;
		this.numberOfSpeakers = builder.numberOfSpeakers;
		this.frequencyRange = builder.frequencyRange;
		this.cordLength = builder.cordLength;
	}

	public static class Builder {
		private int powerConsumption;
		private int numberOfSpeakers;
		private String frequencyRange;
		private int cordLength;

		public Builder powerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public Builder numberOfSpeakers(int numberOfSpeakers) {
			this.numberOfSpeakers = numberOfSpeakers;
			return this;
		}

		public Builder frequencyRange(String frequencyRange) {
			this.frequencyRange = frequencyRange;
			return this;
		}

		public Builder cordLength(int cordLength) {
			this.cordLength = cordLength;
			return this;
		}

		public Speakers build() {
			return new Speakers(this);
		}
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cordLength;
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
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
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

	// you may add your own code here
}
