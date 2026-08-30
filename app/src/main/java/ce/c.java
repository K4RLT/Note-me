package ce;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.mu;
import de.i;
import fa.y;
import j.i0;
import java.util.Arrays;
import java.util.EnumMap;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4100a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4101b;

    static {
        new EnumMap(ee.a.class);
        new EnumMap(ee.a.class);
    }

    public c(String str) {
        y.a("One of cloud model name and base model cannot be empty", !TextUtils.isEmpty(str));
        this.f4100a = str;
        this.f4101b = i.f15847u;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (y.l(this.f4100a, cVar.f4100a) && y.l(null, null) && y.l(this.f4101b, cVar.f4101b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4100a, null, this.f4101b});
    }

    public final String toString() {
        mu muVar = new mu(20);
        i0 i0Var = new i0(26, false);
        ((i0) muVar.f8423w).f18638x = i0Var;
        i0Var.f18637w = this.f4100a;
        i0Var.f18636v = "modelName";
        int i = 26;
        boolean z3 = false;
        i0 i0Var2 = new i0(i, z3);
        i0Var.f18638x = i0Var2;
        i0Var2.f18637w = null;
        i0Var2.f18636v = "baseModel";
        i0 i0Var3 = new i0(i, z3);
        i0Var2.f18638x = i0Var3;
        muVar.f8423w = i0Var3;
        i0Var3.f18637w = this.f4101b;
        i0Var3.f18636v = "modelType";
        return muVar.toString();
    }
}
