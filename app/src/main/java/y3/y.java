package y3;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class y extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public z f30892u;

    /* renamed from: v, reason: collision with root package name */
    public File f30893v;

    /* renamed from: w, reason: collision with root package name */
    public FileOutputStream f30894w;

    /* renamed from: x, reason: collision with root package name */
    public FileOutputStream f30895x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f30896y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z f30897z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ve.c cVar) {
        super(cVar);
        this.f30897z = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30896y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f30897z.j(null, this);
    }
}
