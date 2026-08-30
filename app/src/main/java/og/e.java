package og;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b[] f22000a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f22001b;

    static {
        b bVar = new b(b.i, "");
        sg.h hVar = b.f21980f;
        b bVar2 = new b(hVar, "GET");
        b bVar3 = new b(hVar, "POST");
        sg.h hVar2 = b.f21981g;
        b bVar4 = new b(hVar2, "/");
        b bVar5 = new b(hVar2, "/index.html");
        sg.h hVar3 = b.f21982h;
        b bVar6 = new b(hVar3, "http");
        b bVar7 = new b(hVar3, "https");
        sg.h hVar4 = b.e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f22000a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        for (int i = 0; i < bVarArr.length; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f21983a)) {
                linkedHashMap.put(bVarArr[i].f21983a, Integer.valueOf(i));
            }
        }
        f22001b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(sg.h hVar) {
        int b10 = hVar.b();
        for (int i = 0; i < b10; i++) {
            byte e = hVar.e(i);
            if (e >= 65 && e <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.i());
            }
        }
    }
}
