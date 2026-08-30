package gg;

import c7.x;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r extends ve.c {
    public final /* synthetic */ x A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public pe.b f17789u;

    /* renamed from: v, reason: collision with root package name */
    public x f17790v;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashMap f17791w;

    /* renamed from: x, reason: collision with root package name */
    public String f17792x;

    /* renamed from: y, reason: collision with root package name */
    public int f17793y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f17794z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, ve.a aVar) {
        super(aVar);
        this.A = xVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17794z = obj;
        this.B |= Integer.MIN_VALUE;
        return x.a(this.A, null, this);
    }
}
