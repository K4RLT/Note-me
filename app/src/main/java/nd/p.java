package nd;
import p.a;
import q.x;

import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21275d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f21276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21278c;

    public p(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f21275d.matcher(str3).matches()) {
            this.f21276a = str3;
            this.f21277b = str;
            this.f21278c = wd0.n(str, "!", str2);
            return;
        }
        x.n(a.k("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f21276a.equals(pVar.f21276a) || !this.f21277b.equals(pVar.f21277b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21277b, this.f21276a});
    }
}
