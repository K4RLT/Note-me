package m3;

import android.util.Base64;
import com.daren.scraply.R;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20591b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20592c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20593d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20594f;

    public c(String str, String str2, String str3, List list) {
        str.getClass();
        this.f20590a = str;
        str2.getClass();
        this.f20591b = str2;
        this.f20592c = str3;
        list.getClass();
        this.f20593d = list;
        this.e = 0;
        this.f20594f = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20590a + ", mProviderPackage: " + this.f20591b + ", mQuery: " + this.f20592c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f20593d;
            if (i < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i++;
            } else {
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.e);
                return sb2.toString();
            }
        }
    }

    public c(String str) {
        this.f20590a = "com.google.android.gms.fonts";
        this.f20591b = "com.google.android.gms";
        this.f20592c = str;
        this.f20593d = null;
        this.e = R.array.com_google_android_gms_fonts_certs;
        this.f20594f = "com.google.android.gms.fonts-com.google.android.gms-".concat(str);
    }
}
