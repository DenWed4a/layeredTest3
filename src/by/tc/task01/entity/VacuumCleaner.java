package by.tc.task01.entity;

public class VacuumCleaner implements Appliance {

	private final int powerConsumption;
	private final String filterType;
	private final String bagType;
	private final String wandType;
	private final int motorSpeedRegulation;
	private final int cleaningWidth;

	private VacuumCleaner(Builder builder) {
		this.powerConsumption = builder.powerConsumption;
		this.filterType = builder.filterType;
		this.bagType = builder.bagType;
		this.wandType = builder.wandType;
		this.motorSpeedRegulation = builder.motorSpeedRegulation;
		this.cleaningWidth = builder.cleaningWidth;
	}

	public static class Builder {
		private int powerConsumption;
		private String filterType;
		private String bagType;
		private String wandType;
		private int motorSpeedRegulation;
		private int cleaningWidth;

		public Builder powerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public Builder filterType(String filterType) {
			this.filterType = filterType;
			return this;
		}

		public Builder bagType(String bagType) {
			this.bagType = bagType;
			return this;
		}

		public Builder wandType(String wandType) {
			this.wandType = wandType;
			return this;
		}

		public Builder motorSpeedRegulation(int motorSpeedRegulation) {
			this.motorSpeedRegulation = motorSpeedRegulation;
			return this;
		}

		public Builder cleaningWidth(int cleaningWidth) {
			this.cleaningWidth = cleaningWidth;
			return this;
		}

		public VacuumCleaner build() {
			return new VacuumCleaner(this);
		}

	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedRegulation;
		result = prime * result + powerConsumption;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}

	// you may add your own code here
}
