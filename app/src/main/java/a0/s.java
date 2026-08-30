package a0;
import b0.c0;
import b0.g0;
import w.a;

import java.util.List;

/* loaded from: classes.dex */
public final class s implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f127a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f130d;
    public final /* synthetic */ l0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f133h;

    public s(l lVar, c0 c0Var, int i, l0 l0Var, int i10, int i11, long j10) {
        this.f130d = c0Var;
        this.e = l0Var;
        this.f131f = i10;
        this.f132g = i11;
        this.f133h = j10;
        this.f127a = lVar;
        this.f128b = c0Var;
        this.f129c = i;
    }

    public final a0 a(long j10, int i, int i10, int i11, int i12) {
        int i13;
        l lVar = this.f127a;
        Object b10 = lVar.b(i);
        Object j11 = lVar.f83b.j(i);
        List b11 = this.f128b.b(i, j10);
        if (y2.a.f(j10)) {
            i13 = y2.a.j(j10);
        } else {
            if (!y2.a.e(j10)) {
                a.a("does not have fixed height");
            }
            i13 = y2.a.i(j10);
        }
        int i14 = i13;
        y2.m layoutDirection = this.f130d.f1163v.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.b bVar = this.e.f96m;
        return new a0(i, b10, i14, i12, layoutDirection, this.f131f, this.f132g, b11, this.f133h, j11, bVar, j10, i10, i11);
    }
}
