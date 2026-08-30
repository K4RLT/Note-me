package jg;

import a6.t;
import a6.w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b6.r;
import b6.v;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import j6.c;
import j6.h;
import j6.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import r5.j;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19197u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f19198v;

    public a(String str, Object[] objArr) {
        this.f19197u = 0;
        byte[] bArr = b.f19199a;
        this.f19198v = String.format(Locale.US, str, objArr);
    }

    public static void a(r rVar, String str) {
        v b10;
        WorkDatabase workDatabase = rVar.f1774c;
        q C = workDatabase.C();
        c x9 = workDatabase.x();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int g8 = C.g(str2);
            if (g8 != 3 && g8 != 4) {
                WorkDatabase_Impl workDatabase_Impl = C.f18965a;
                workDatabase_Impl.b();
                h hVar = C.e;
                j a10 = hVar.a();
                if (str2 == null) {
                    a10.g(1);
                } else {
                    a10.n(1, str2);
                }
                workDatabase_Impl.c();
                try {
                    a10.f();
                    workDatabase_Impl.v();
                } finally {
                    workDatabase_Impl.h();
                    hVar.f(a10);
                }
            }
            linkedList.addAll(x9.b(str2));
        }
        b6.h hVar2 = rVar.f1776f;
        synchronized (hVar2.f1746k) {
            a6.q.d().a(b6.h.f1737l, "Processor cancelling " + str);
            hVar2.i.add(str);
            b10 = hVar2.b(str);
        }
        b6.h.d(str, b10, 1);
        Iterator it = rVar.e.iterator();
        while (it.hasNext()) {
            ((b6.j) it.next()).d(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19197u) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName((String) this.f19198v);
                try {
                    b();
                    return;
                } finally {
                    Thread.currentThread().setName(name);
                }
            default:
                pw pwVar = (pw) this.f19198v;
                try {
                    c();
                    pwVar.g(w.f294a);
                    return;
                } catch (Throwable th) {
                    pwVar.g(new t(th));
                    return;
                }
        }
    }

    public a() {
        this.f19197u = 1;
        this.f19198v = new pw(1);
    }
}
