package y3;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class v extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public z f30876u;

    /* renamed from: v, reason: collision with root package name */
    public FileInputStream f30877v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30878w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f30879x;

    /* renamed from: y, reason: collision with root package name */
    public int f30880y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, ve.c cVar) {
        super(cVar);
        this.f30879x = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30878w = obj;
        this.f30880y |= Integer.MIN_VALUE;
        return this.f30879x.g(this);
    }
}
