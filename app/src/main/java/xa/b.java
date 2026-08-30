package xa;

import com.google.android.gms.internal.ads.q41;
import com.google.android.gms.internal.mlkit_vision_digital_ink.v3;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends q41 {
    public final /* synthetic */ d A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f30360z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(dVar);
        this.f30360z = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(dVar);
                this.A = dVar;
                super(dVar);
                return;
            case 2:
                Objects.requireNonNull(dVar);
                this.A = dVar;
                super(dVar);
                return;
            default:
                Objects.requireNonNull(dVar);
                this.A = dVar;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final Object a(int i) {
        int i10 = this.f30360z;
        d dVar = this.A;
        switch (i10) {
            case 0:
                Object obj = d.D;
                return dVar.a()[i];
            case 1:
                return new v3(dVar, i);
            default:
                Object obj2 = d.D;
                return dVar.b()[i];
        }
    }
}
