class Restaurant {
    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        notify();
    }

    synchronized void serveFood() {
        try {
            wait();
        } catch (Exception e) {}
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> r.prepareFood());
        Thread waiter = new Thread(() -> r.serveFood());

        waiter.start();
        chef.start();
    }
}