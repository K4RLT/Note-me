package rd;

import java.util.Objects;
import q.x;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f24742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24743b;

    public m(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f24743b = null;
        this.f24742a = 1;
    }

    public boolean a() {
        String str;
        int i = this.f24742a;
        if (i != 0) {
            if (i == 0) {
                str = "";
            } else {
                str = this.f24743b;
            }
            String trim = str.trim();
            if (g.e.matcher(trim).matches()) {
                return true;
            }
            if (g.f24711f.matcher(trim).matches()) {
                return false;
            }
            x.n(p.a.k("[Value: ", trim, "] cannot be converted to a boolean."));
            return false;
        }
        return false;
    }

    public m(String str, int i) {
        this.f24743b = str;
        this.f24742a = i;
    }

    public m(String str) {
        this.f24743b = str;
        this.f24742a = 0;
    }

    public m(int i, String str) {
        this.f24742a = i;
        this.f24743b = str;
    }
}
