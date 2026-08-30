package lb;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f20167x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, ib.h hVar, int i) {
        super(oVar, hVar);
        this.f20167x = i;
    }

    @Override // lb.i
    public void z1(Bundle bundle, Bundle bundle2) {
        switch (this.f20167x) {
            case 1:
                super.z1(bundle, bundle2);
                this.f20157v.d((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
                return;
            default:
                super.z1(bundle, bundle2);
                return;
        }
    }
}
