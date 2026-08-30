package k9;
import f.c;

import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.eb;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.mu;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends gb {
    public final Object G;
    public final p H;
    public final /* synthetic */ byte[] I;
    public final /* synthetic */ Map J;
    public final /* synthetic */ l9.f K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, int i, String str, p pVar, mu muVar, byte[] bArr, Map map, l9.f fVar) {
        super(i, str, muVar);
        this.I = bArr;
        this.J = map;
        this.K = fVar;
        this.G = new Object();
        this.H = pVar;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final Map e() {
        Map map = this.J;
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final byte[] f() {
        byte[] bArr = this.I;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final com.google.android.gms.internal.ads.d h(eb ebVar) {
        String str;
        String str2;
        byte[] bArr = ebVar.f5631b;
        try {
            Map map = ebVar.f5632c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new com.google.android.gms.internal.ads.d(str, b80.f(ebVar));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void i(Object obj) {
        p pVar;
        String str = (String) obj;
        l9.f fVar = this.K;
        if (l9.c() && str != null) {
            fVar.e("onNetworkResponseBody", new ic.c(9, str.getBytes()));
        }
        synchronized (this.G) {
            pVar = this.H;
        }
        pVar.b(str);
    }
}
