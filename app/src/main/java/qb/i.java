package qb;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f23642a = 1;

    /* renamed from: b, reason: collision with root package name */
    public a f23643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23644c;

    public i(String str, a aVar) {
        this.f23644c = str;
        this.f23643b = aVar;
    }

    public final boolean a(int i) {
        int i10 = this.f23642a;
        String str = this.f23644c;
        if (i10 == i) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was already set to " + i);
            return false;
        }
        if (i10 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            StringBuilder m4 = a5.a.m("targetPackage: ", str, " status: ", this.f23642a, "->");
            m4.append(i);
            Log.i("HsdpOverlay", m4.toString());
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    Bundle bundle = new Bundle();
                    bundle.putString("targetPackage", str);
                    bundle.putBoolean("dldpRedirect", true);
                    this.f23643b.W(bundle);
                } else if (this.f23642a == 2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("targetPackage", str);
                    bundle2.putString("errorMessage", "HSDP overlay destroyed");
                    this.f23643b.W(bundle2);
                }
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString("targetPackage", str);
                this.f23643b.W(bundle3);
            }
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", str);
            this.f23643b.N(bundle4);
        }
        this.f23642a = i;
        return true;
    }

    public final String toString() {
        int i = this.f23642a;
        String valueOf = String.valueOf(this.f23643b);
        StringBuilder sb2 = new StringBuilder("HsdpOverlay{'");
        sb2.append(this.f23644c);
        sb2.append("': ");
        sb2.append(i);
        sb2.append(", ");
        return a5.a.k(sb2, valueOf, "}");
    }
}
