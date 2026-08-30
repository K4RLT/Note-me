package p4;

import com.google.android.gms.internal.ads.o80;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public final q4.a f22397d = new Object();
    public final q4.a e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final q4.a f22398f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final q4.a f22399g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public double f22400h = 0.0d;
    public double i = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public int f22401j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final q4.b f22402k = new q4.b(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final q4.b f22403l = new q4.b(1, 1);

    /* renamed from: m, reason: collision with root package name */
    public final q4.b f22404m = new q4.b(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final o80 f22394a = a();

    /* renamed from: b, reason: collision with root package name */
    public final o80 f22395b = a();

    /* renamed from: c, reason: collision with root package name */
    public final o80 f22396c = a();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.o80, java.lang.Object] */
    public final o80 a() {
        Object obj = new Object();
        obj.f9020a = new q4.b(4, 1);
        q4.b bVar = new q4.b(4, 4);
        q4.b.g(bVar);
        obj.f9021b = bVar;
        q4.b bVar2 = new q4.b(4, 4);
        q4.b.g(bVar2);
        obj.f9022c = bVar2;
        q4.b bVar3 = new q4.b(1, 1);
        q4.b.g(bVar3);
        obj.f9023d = bVar3;
        obj.e = new q4.b(4, 4);
        obj.f9024f = new q4.b(1, 4);
        obj.f9027j = new q4.b(4, 1);
        obj.f9028k = new q4.b(4, 1);
        obj.f9025g = new q4.b(4, 1);
        obj.f9026h = new q4.b(4, 4);
        obj.i = new q4.b(4, 4);
        obj.f9029l = new q4.b(1, 1);
        obj.f9030m = new q4.b(1, 4);
        obj.f9031n = new q4.b(1, 1);
        obj.f9032o = new q4.b(1, 2);
        obj.e = new q4.b(4, new double[]{1.0d, 1.0d, 0.5d, 0.16d, 0.0d, 1.0d, 1.0d, 0.5d, 0.0d, 0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d});
        q4.b bVar4 = new q4.b(1, new double[]{0.16d, 0.5d, 1.0d, 1.0d});
        bVar4.b(bVar4, bVar2);
        int i = 4 * 4;
        for (int i10 = 0; i10 < i; i10++) {
            double[] dArr = bVar2.f23451c;
            dArr[i10] = dArr[i10] * 0.01d;
        }
        obj.f9024f = new q4.b(4, new double[]{1.0d, 0.0d, 0.0d, 0.0d});
        ((q4.b) obj.f9023d).f(0, 0, 1.0d);
        return obj;
    }
}