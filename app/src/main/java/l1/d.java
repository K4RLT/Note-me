package l1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f19813a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f19814b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f19815c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f19816d;
    public static final q e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f19817f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f19818g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f19819h;
    public static final q i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f19820j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f19821k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f19822l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f19823m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f19824n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f19825o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f19826p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f19827q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f19828r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f19829s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f19830t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f19831u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f19832v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f19833w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f19834x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f19835y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [l1.l, l1.c] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f19813a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f19814b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f19815c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f19816d = rVar4;
        s sVar = j.f19846d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f19817f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new g5.q(22), new g5.q(23), -0.799f, 2.399f, rVar, 2);
        f19818g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f19819h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f19820j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f19821k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f19822l = qVar8;
        double d2 = 0.2222222222222222d;
        double d10 = 0.081d;
        double d11 = 2.2222222222222223d;
        double d12 = 0.9099181073703367d;
        double d13 = 0.09008189262966333d;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f19843a, new r(d11, d12, d13, d2, d10), 8);
        f19823m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(d11, d12, d13, d2, d10), 9);
        f19824n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f19825o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f19844b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f19826p = qVar12;
        s sVar2 = j.f19845c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f19827q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f19828r = qVar14;
        k kVar = new k(14, 1, b.f19807b, "Generic XYZ");
        f19829s = kVar;
        long j10 = b.f19808c;
        k kVar2 = new k(15, 0, j10, "Generic L*a*b*");
        f19830t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f19831u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new g5.q(24), new g5.q(25), 0.0f, 1.0f, rVar3, 17);
        f19832v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new g5.q(26), new g5.q(27), 0.0f, 1.0f, rVar4, 18);
        f19833w = qVar17;
        c cVar = new c("Oklab", j10, 19);
        f19834x = cVar;
        f19835y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, cVar};
    }

    public static double a(r rVar, double d2) {
        double d10;
        double exp;
        if (d2 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = d2 * d10;
        double d12 = rVar.f19873b;
        double d13 = rVar.f19874c;
        double d14 = rVar.f19875d;
        double d15 = rVar.e;
        double d16 = rVar.f19876f;
        double d17 = rVar.f19877g + 1.0d;
        double d18 = d12 * d11;
        if (d18 <= 1.0d) {
            exp = Math.pow(d18, d13);
        } else {
            exp = Math.exp((d11 - d16) * d14) + d15;
        }
        return d17 * d10 * exp;
    }

    public static double b(r rVar, double d2) {
        double d10;
        double log;
        if (d2 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = 1.0d / rVar.f19873b;
        double d12 = 1.0d / rVar.f19874c;
        double d13 = 1.0d / rVar.f19875d;
        double d14 = rVar.e;
        double d15 = rVar.f19876f;
        double d16 = (d2 * d10) / (rVar.f19877g + 1.0d);
        if (d16 <= 1.0d) {
            log = Math.pow(d16, d12) * d11;
        } else {
            log = (Math.log(d16 - d14) * d13) + d15;
        }
        return d10 * log;
    }

    public static double c(r rVar, double d2) {
        double d10;
        double d11 = 0.0d;
        if (d2 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d12 = d2 * d10;
        double d13 = rVar.f19873b;
        double d14 = rVar.f19875d;
        double pow = (Math.pow(d12, d14) * rVar.f19874c) + d13;
        if (pow >= 0.0d) {
            d11 = pow;
        }
        return Math.pow(d11 / ((Math.pow(d12, d14) * rVar.f19876f) + rVar.e), rVar.f19877g) * d10;
    }

    public static double d(r rVar, double d2) {
        double d10;
        if (d2 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = d2 * d10;
        double d12 = -rVar.f19873b;
        double d13 = rVar.e;
        double d14 = 1.0d / rVar.f19877g;
        return Math.pow(Math.max((Math.pow(d11, d14) * d13) + d12, 0.0d) / ((Math.pow(d11, d14) * (-rVar.f19876f)) + rVar.f19874c), 1.0d / rVar.f19875d) * d10;
    }
}