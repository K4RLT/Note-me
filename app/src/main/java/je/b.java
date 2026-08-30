package je;

import fa.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends ce.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19172d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final c f19173c;

    public b(c cVar) {
        super("digital_ink_recognition_model_".concat(String.valueOf(cVar)));
        this.f19173c = cVar;
    }

    @Override // ce.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        return y.l(this.f19173c, ((b) obj).f19173c);
    }

    @Override // ce.c
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f19173c});
    }
}
