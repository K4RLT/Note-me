package w6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27720a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.a f27721b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.a f27722c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.a f27723d;
    public final v6.a e;

    /* renamed from: f, reason: collision with root package name */
    public final v6.b f27724f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27726h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27727j;

    /* renamed from: k, reason: collision with root package name */
    public final v6.b f27728k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27729l;

    public e(String str, int i, v6.a aVar, v6.a aVar2, v6.a aVar3, v6.a aVar4, v6.b bVar, int i10, int i11, float f10, ArrayList arrayList, v6.b bVar2, boolean z3) {
        this.f27720a = i;
        this.f27721b = aVar;
        this.f27722c = aVar2;
        this.f27723d = aVar3;
        this.e = aVar4;
        this.f27724f = bVar;
        this.f27725g = i10;
        this.f27726h = i11;
        this.i = f10;
        this.f27727j = arrayList;
        this.f27728k = bVar2;
        this.f27729l = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new q6.i(jVar, bVar, this);
    }
}
