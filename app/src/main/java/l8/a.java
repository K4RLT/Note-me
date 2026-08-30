package l8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import k8.c;
import q.x;
import ya.k0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f20018c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f20019d;
    public static final a e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f20020f;

    /* renamed from: a, reason: collision with root package name */
    public final String f20021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20022b;

    static {
        String a10 = k0.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20018c = a10;
        String a11 = k0.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a12 = k0.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20019d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        e = new a(a10, null);
        f20020f = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f20021a = str;
        this.f20022b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                x.n("Missing endpoint in CCTDestination extras");
                return null;
            }
            x.n("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        x.n("Version marker missing from extras");
        return null;
    }
}
