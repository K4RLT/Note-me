package ya;

import com.google.android.gms.internal.ads.q41;

/* loaded from: classes.dex */
public final class a extends q41 {
    public final /* synthetic */ d A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f31004z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i) {
        super(dVar);
        this.f31004z = i;
        this.A = dVar;
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final Object a(int i) {
        switch (this.f31004z) {
            case 0:
                Object[] objArr = this.A.f31191w;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new c(this.A, i);
            default:
                Object[] objArr2 = this.A.f31192x;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
