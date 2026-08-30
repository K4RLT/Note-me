package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ig0 {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f7131a;

    /* renamed from: b, reason: collision with root package name */
    public final io0 f7132b;

    /* renamed from: c, reason: collision with root package name */
    public final re0 f7133c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f7134d;
    public final ArrayDeque e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f7135f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7136g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7137h;
    public final boolean i;

    public ig0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, s6 s6Var, re0 re0Var, boolean z3) {
        io0 io0Var;
        this.f7131a = thread;
        this.f7134d = copyOnWriteArraySet;
        this.f7133c = re0Var;
        this.f7136g = new Object();
        this.e = new ArrayDeque();
        this.f7135f = new ArrayDeque();
        if (looper != null && s6Var != null && re0Var != null) {
            io0Var = s6Var.x(looper, new bg0(0, this));
        } else {
            io0Var = null;
        }
        this.f7132b = io0Var;
        this.i = z3;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f7136g) {
            try {
                if (this.f7137h) {
                    return;
                }
                this.f7134d.add(new df0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        boolean z3;
        if (this.i) {
            if (Thread.currentThread() == this.f7131a) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f7134d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            df0 df0Var = (df0) it.next();
            if (df0Var.f5414a.equals(obj)) {
                df0Var.f5417d = true;
                re0 re0Var = this.f7133c;
                if (re0Var != null && df0Var.f5416c) {
                    df0Var.f5416c = false;
                    re0Var.f(df0Var.f5414a, df0Var.f5415b.u());
                }
                copyOnWriteArraySet.remove(df0Var);
            }
        }
    }

    public final void c(int i, ie0 ie0Var) {
        boolean z3;
        if (this.i) {
            if (Thread.currentThread() == this.f7131a) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
        }
        this.f7135f.add(new pf0(i, 0, new CopyOnWriteArraySet(this.f7134d), ie0Var));
    }

    public final void d() {
        boolean z3;
        if (this.i) {
            if (Thread.currentThread() == this.f7131a) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
        }
        ArrayDeque arrayDeque = this.f7135f;
        if (!arrayDeque.isEmpty()) {
            if (this.f7133c != null) {
                io0 io0Var = this.f7132b;
                io0Var.getClass();
                Handler handler = io0Var.f7185a;
                if (!handler.hasMessages(1)) {
                    fo0 g8 = io0.g();
                    Message obtainMessage = handler.obtainMessage(1);
                    g8.f6137a = obtainMessage;
                    obtainMessage.getClass();
                    handler.sendMessageAtFrontOfQueue(obtainMessage);
                    g8.f6137a = null;
                    io0.f(g8);
                }
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void e() {
        boolean z3;
        if (this.i) {
            if (Thread.currentThread() == this.f7131a) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
        }
        synchronized (this.f7136g) {
            this.f7137h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f7134d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            df0 df0Var = (df0) it.next();
            re0 re0Var = this.f7133c;
            df0Var.f5417d = true;
            if (re0Var != null && df0Var.f5416c) {
                df0Var.f5416c = false;
                re0Var.f(df0Var.f5414a, df0Var.f5415b.u());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public ig0(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
