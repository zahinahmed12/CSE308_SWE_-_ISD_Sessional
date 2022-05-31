class computerA extends computerFactory{

    private String resolution;
    private double res_width;
    private double res_height;
    public computerA()
    {
        this.resolution="200 X 200";
        this.res_width=200;
        this.res_height=200;
    }
    public String getResolution() {
        return resolution;
    }

    public double getRes_width() {
        return res_width;
    }

    public double getRes_height() {
        return res_height;
    }

    public String getName() {
        return "COMPUTER-A";
    }

    @Override
    public cpu getCpu() {
        return new cpuA();
    }

    @Override
    public mmu getMmu() {
        return new mmuA();
    }
}
