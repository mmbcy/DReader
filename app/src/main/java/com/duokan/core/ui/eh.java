package com.duokan.core.ui;

import android.graphics.Paint;

import com.duokan.core.sys.ap;

final class eh extends ap {
    eh() {
    }

    protected Object b() {
        return c();
    }

    protected  void b(Object obj) {
        a((Paint) obj);
    }

    protected Paint c() {
        return new Paint();
    }

    protected void a(Paint paint) {
        paint.reset();
    }
}
