package by.tc.task01.entity;

public class TabletPC implements Appliance {
	private final int batteryCapacity;
	private final int displayInchs;
	private final int memoryRom;
	private final int flashMemoryCapacity;
	private final String color;

	private TabletPC(Builder builder) {
		this.batteryCapacity = builder.batteryCapacity;
		this.displayInchs = builder.displayInchs;
		this.memoryRom = builder.memoryRom;
		this.flashMemoryCapacity = builder.flashMemoryCapacity;
		this.color = builder.color;
	}

	public static class Builder {
		private int batteryCapacity;
		private int displayInchs;
		private int memoryRom;
		private int flashMemoryCapacity;
		private String color;

		public Builder batteryCapacity(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
			return this;
		}

		public Builder displayInchs(int displayInchs) {
			this.displayInchs = displayInchs;
			return this;
		}

		public Builder memoryRom(int memoryRom) {
			this.memoryRom = memoryRom;
			return this;
		}

		public Builder flashMemoryCapacity(int flashMemoryCapacity) {
			this.flashMemoryCapacity = flashMemoryCapacity;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}

		public TabletPC build() {
			return new TabletPC(this);
		}
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInchs;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInchs=" + displayInchs + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

	// you may add your own code here
}
