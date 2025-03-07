package harkerrobolib.util;

public class CANDevice {
  public static final String kRIOCANbusName = "rio";

  public final int deviceNumber;
  public final String CANbusName;

  public CANDevice(final int deviceNumber, final String CANbusName) {
    this.deviceNumber = deviceNumber;
    this.CANbusName = CANbusName;
  }

  public CANDevice(final int deviceNumber) {
    this(deviceNumber, kRIOCANbusName);
  }

  public String toString() {
    return "[" + CANbusName + " " + deviceNumber + "]";
  }
}