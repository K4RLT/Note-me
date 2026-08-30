package pc;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: w, reason: collision with root package name */
    public static final mc.c f22655w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final Object f22656u;

    /* renamed from: v, reason: collision with root package name */
    public Object f22657v;

    public e(tc.c cVar) {
        this.f22656u = cVar;
        this.f22657v = f22655w;
    }

    @Override // pc.j
    public void a(i iVar, int i) {
        int[] iArr = (int[]) this.f22657v;
        try {
            iVar.read((byte[]) this.f22656u, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f22656u = bArr;
        this.f22657v = iArr;
    }
}
