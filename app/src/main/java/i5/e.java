package i5;

/* loaded from: classes.dex */
public final class e extends ve.c {
    public eb.w A;
    public /* synthetic */ Object B;
    public final /* synthetic */ f C;
    public int D;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18231u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18232v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18233w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.y f18234x;

    /* renamed from: y, reason: collision with root package name */
    public te.g f18235y;

    /* renamed from: z, reason: collision with root package name */
    public kotlin.jvm.internal.y f18236z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ve.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.F(false, null, this);
    }
}
