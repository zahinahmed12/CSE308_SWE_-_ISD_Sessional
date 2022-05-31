class computerB extends computerFactory{

    private String resolution;
    private double res_width;
    private double res_height;

    public computerB()
    {
        this.resolution="350 X 250";
        this.res_width=350;
        this.res_height=250;
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
        return "COMPUTER-B";
    }
    @Override
    public cpu getCpu() {
        return new cpuB();
    }

    @Override
    public mmu getMmu() {
        return new mmuB();
    }
}

