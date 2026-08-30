package b2;
import b.c;
import b2.d2;
import j.a;
import j.b;
import n.j0;
import n.q0;
import z1.q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.b71;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.ig0;
import com.google.android.gms.internal.ads.l61;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.tn1;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.ys1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1437b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1438c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1439d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1440f;

    public d2() {
        this.f1437b = new q[32];
        this.f1438c = new float[32];
        this.f1439d = new byte[32];
        int i = q0.f20928a;
        this.e = new j0();
        this.f1440f = new j0();
    }

    public void a() {
        a aVar = (a) this.f1437b;
        Drawable background = aVar.getBackground();
        if (background != null) {
            if (((ig.h) this.f1439d) != null) {
                if (((ig.h) this.f1440f) == null) {
                    this.f1440f = new Object();
                }
                ig.h hVar = (ig.h) this.f1440f;
                hVar.f18505c = null;
                hVar.f18504b = false;
                hVar.f18506d = null;
                hVar.f18503a = false;
                boolean z3 = q3.p.f23420a;
                ColorStateList b10 = q3.b(aVar);
                if (b10 != null) {
                    hVar.f18504b = true;
                    hVar.f18505c = b10;
                }
                PorterDuff.Mode c10 = q3.c(aVar);
                if (c10 != null) {
                    hVar.f18503a = true;
                    hVar.f18506d = c10;
                }
                if (hVar.f18504b || hVar.f18503a) {
                    b.c(background, hVar, aVar.getDrawableState());
                    return;
                }
            }
            ig.h hVar2 = (ig.h) this.e;
            if (hVar2 != null) {
                b.c(background, hVar2, aVar.getDrawableState());
                return;
            }
            ig.h hVar3 = (ig.h) this.f1439d;
            if (hVar3 != null) {
                b.c(background, hVar3, aVar.getDrawableState());
            }
        }
    }

    public void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((ig.h) this.f1439d) == null) {
                this.f1439d = new Object();
            }
            ig.h hVar = (ig.h) this.f1439d;
            hVar.f18505c = colorStateList;
            hVar.f18504b = true;
        } else {
            this.f1439d = null;
        }
        a();
    }

    public void c(int i) {
        boolean z3;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        this.f1436a = i;
        e(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r8 < r1.f7962v) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r8, com.google.android.gms.internal.ads.xk0 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f1436a
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f1436a
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.l61 r1 = (com.google.android.gms.internal.ads.l61) r1
            java.lang.String r3 = com.google.android.gms.internal.ads.bq0.f4860a
            long r3 = r1.f7962v
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.f1438c
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.xk0 r1 = new com.google.android.gms.internal.ads.xk0
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.xk0 r1 = (com.google.android.gms.internal.ads.xk0) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.f12580a
            int r10 = r10.f12581b
            byte[] r4 = r1.f12580a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.f1440f
            com.google.android.gms.internal.ads.l61 r10 = (com.google.android.gms.internal.ads.l61) r10
            if (r10 == 0) goto L6a
            long r3 = r10.f7962v
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r8 = r10.f7961u
            r8.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.f1439d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.l61 r10 = new com.google.android.gms.internal.ads.l61
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.l61 r10 = (com.google.android.gms.internal.ads.l61) r10
        L80:
            java.util.ArrayList r3 = r10.f7961u
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.b80.K(r4)
            r10.f7962v = r8
            r3.add(r1)
            r0.add(r10)
            r7.f1440f = r10
            int r8 = r7.f1436a
            if (r8 == r2) goto L9a
            r7.e(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r0 = r7.f1437b
            com.google.android.gms.internal.ads.b71 r0 = (com.google.android.gms.internal.ads.b71) r0
            b(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d2.d(long, com.google.android.gms.internal.ads.xk0):void");
    }

    public void e(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.e;
            if (priorityQueue.size() > i) {
                l61 l61Var = (l61) priorityQueue.poll();
                String str = bq0.f4860a;
                int i10 = 0;
                while (true) {
                    arrayList = l61Var.f7961u;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    ((b71) this.f1437b).b(l61Var.f7962v, (xk0) arrayList.get(i10));
                    ((ArrayDeque) this.f1438c).push((xk0) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
                l61 l61Var2 = (l61) this.f1440f;
                if (l61Var2 != null && l61Var2.f7962v == l61Var.f7962v) {
                    this.f1440f = null;
                }
                ((ArrayDeque) this.f1439d).push(l61Var);
            } else {
                return;
            }
        }
    }

    public void f(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            lt0 lt0Var = (lt0) this.f1439d;
            lt0Var.getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            ys1 ys1Var = (ys1) lt0Var.f8135v;
            ys1Var.Q0();
            ys1Var.k2(1, num, 10);
            ys1Var.k2(2, num, 10);
            tn1 tn1Var = new tn1(intValue);
            ig0 ig0Var = ys1Var.H;
            ig0Var.c(21, tn1Var);
            ig0Var.d();
        }
    }

    public d2(b71 b71Var) {
        this.f1437b = b71Var;
        this.f1438c = new ArrayDeque();
        this.f1439d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f1436a = -1;
    }
}
