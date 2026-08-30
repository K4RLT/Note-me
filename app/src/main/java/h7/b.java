package h7;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public Context f17873u;

    /* renamed from: v, reason: collision with root package name */
    public String f17874v;

    /* renamed from: w, reason: collision with root package name */
    public j7.f f17875w;

    /* renamed from: x, reason: collision with root package name */
    public File f17876x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f17877y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f17878z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ve.c cVar2) {
        super(cVar2);
        this.f17878z = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17877y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f17878z.d(null, null, null, this);
    }
}
