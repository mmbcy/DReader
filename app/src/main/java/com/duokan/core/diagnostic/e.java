package com.duokan.core.diagnostic;

class e implements Runnable {
    public boolean a = false;
    final d b;

    e(d dVar) {
        this.b = dVar;
    }

    public void run() {
        this.a = true;
    }
}
