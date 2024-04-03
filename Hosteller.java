class Hosteller extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;

    public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }

    @Override
    public double calculateTotalFee() {
        double hostelFee;
        if (blockName == 'A') {
            hostelFee = 60000;
        } else if (blockName == 'B') {
            hostelFee = 50000;
        } else {
            hostelFee = 40000;
        }
        if (roomType.equals("AC")) {
            return collegeFee + hostelFee + 8000;
        } else {
            return collegeFee + hostelFee + 5000;
        }
    }

    // Getters and setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getBlockName() {
        return blockName;
    }

    public void setBlockName(char blockName) {
        this.blockName = blockName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}