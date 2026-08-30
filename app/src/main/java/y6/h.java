package y6;
import d.c;
import n.a;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: u, reason: collision with root package name */
    public static final h f30934u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final j6.e f30935v = j6.e.j("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v0, types: [u6.b, java.lang.Object] */
    @Override // y6.d0
    public final Object d(z6.a aVar, float f10) {
        PointF pointF;
        PointF pointF2;
        aVar.j();
        String str = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z3 = true;
        int i12 = 3;
        String str2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (aVar.p()) {
            switch (aVar.L(f30935v)) {
                case 0:
                    str = aVar.B();
                    break;
                case 1:
                    str2 = aVar.B();
                    break;
                case 2:
                    pointF = pointF3;
                    f11 = (float) aVar.w();
                    pointF3 = pointF;
                    break;
                case 3:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int A = aVar.A();
                    if (A <= 2 && A >= 0) {
                        i12 = q0.c(3)[A];
                    } else {
                        i12 = 3;
                    }
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case 4:
                    i = aVar.A();
                    break;
                case 5:
                    pointF = pointF3;
                    f12 = (float) aVar.w();
                    pointF3 = pointF;
                    break;
                case 6:
                    pointF = pointF3;
                    f13 = (float) aVar.w();
                    pointF3 = pointF;
                    break;
                case 7:
                    i10 = a(aVar);
                    break;
                case 8:
                    i11 = a(aVar);
                    break;
                case 9:
                    pointF = pointF3;
                    f14 = (float) aVar.w();
                    pointF3 = pointF;
                    break;
                case 10:
                    z3 = aVar.r();
                    break;
                case 11:
                    aVar.f();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) aVar.w()) * f10, ((float) aVar.w()) * f10);
                    aVar.k();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    aVar.f();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) aVar.w()) * f10, ((float) aVar.w()) * f10);
                    aVar.k();
                    pointF3 = pointF;
                    break;
                default:
                    aVar.M();
                    aVar.N();
                    break;
            }
        }
        aVar.m();
        Object obj = new Object();
        obj.f25859a = str;
        obj.f25860b = str2;
        obj.f25861c = f11;
        obj.f25862d = i12;
        obj.e = i;
        obj.f25863f = f12;
        obj.f25864g = f13;
        obj.f25865h = i10;
        obj.i = i11;
        obj.f25866j = f14;
        obj.f25867k = z3;
        obj.f25868l = pointF3;
        obj.f25869m = pointF4;
        return obj;
    }
}