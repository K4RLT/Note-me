package jg;

import eb.u1;
import g5.q;
import ig.l;
import ig.n;
import ig.x;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import sg.h;
import sg.t;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19199a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f19200b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final x f19201c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f19202d;
    public static final TimeZone e;

    /* renamed from: f, reason: collision with root package name */
    public static final u1 f19203f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f19204g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f19205h;

    /* JADX WARN: Type inference failed for: r3v1, types: [okio.BufferedSource, sg.f, java.lang.Object] */
    static {
        Method method;
        byte[] bArr = new byte[0];
        f19199a = bArr;
        Object obj = new Object();
        obj.m228write(bArr, 0, 0);
        long j10 = 0;
        f19201c = new x(j10, obj, 0);
        if (j10 >= 0 && j10 <= j10 && 0 >= j10) {
            h.a("efbbbf");
            h.a("feff");
            h.a("fffe");
            h.a("0000ffff");
            h.a("ffff0000");
            f19202d = Charset.forName("UTF-8");
            Charset.forName("ISO-8859-1");
            Charset.forName("UTF-16BE");
            Charset.forName("UTF-16LE");
            Charset.forName("UTF-32BE");
            Charset.forName("UTF-32LE");
            e = TimeZone.getTimeZone("GMT");
            f19203f = new u1(2);
            try {
                method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
            } catch (Exception unused) {
                method = null;
            }
            f19204g = method;
            f19205h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static AssertionError a(Exception exc, String str) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [sg.f, java.lang.Object] */
    public static String b(String str) {
        InetAddress g8;
        int i = -1;
        int i10 = 0;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                g8 = g(str, 1, str.length() - 1);
            } else {
                g8 = g(str, 0, str.length());
            }
            if (g8 != null) {
                byte[] address = g8.getAddress();
                if (address.length == 16) {
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < address.length) {
                        int i13 = i11;
                        while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                            i13 += 2;
                        }
                        int i14 = i13 - i11;
                        if (i14 > i12 && i14 >= 4) {
                            i = i11;
                            i12 = i14;
                        }
                        i11 = i13 + 2;
                    }
                    Object obj = new Object();
                    while (i10 < address.length) {
                        if (i10 == i) {
                            obj.H(58);
                            i10 += i12;
                            if (i10 == 16) {
                                obj.H(58);
                            }
                        } else {
                            if (i10 > 0) {
                                obj.H(58);
                            }
                            obj.K(((address[i10] & 255) << 8) | (address[i10 + 1] & 255));
                            i10 += 2;
                        }
                    }
                    return obj.r();
                }
                q.f(p.a.k("Invalid IPv6 address: '", str, "'"));
                return null;
            }
            return null;
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty()) {
                while (i10 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i10);
                    if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                        i10++;
                    } else {
                        return null;
                    }
                }
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int c(long j10) {
        if (j10 >= 0) {
            if (TimeUnit.MILLISECONDS != null) {
                if (j10 <= 2147483647L) {
                    if (j10 == 0 && j10 > 0) {
                        q.x.n("timeout too small.");
                        return 0;
                    }
                    return (int) j10;
                }
                q.x.n("timeout too large.");
                return 0;
            }
            q.h("unit == null");
            return 0;
        }
        q.x.n("timeout < 0");
        return 0;
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e8) {
                if (!n(e8)) {
                    throw e8;
                }
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress g(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.g(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int h(String str, int i, int i10, char c10) {
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static int i(String str, int i, int i10, String str2) {
        while (i < i10) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String k(n nVar, boolean z3) {
        String str = nVar.f18538d;
        int i = nVar.e;
        boolean contains = str.contains(":");
        String str2 = nVar.f18538d;
        if (contains) {
            str2 = p.a.k("[", str2, "]");
        }
        if (!z3 && i == n.b(nVar.f18535a)) {
            return str2;
        }
        return str2 + ":" + i;
    }

    public static List l(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] m(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean n(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static boolean o(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [sg.f, java.lang.Object] */
    public static boolean p(t tVar, int i) {
        long j10;
        long nanoTime = System.nanoTime();
        if (tVar.a().e()) {
            j10 = tVar.a().c() - nanoTime;
        } else {
            j10 = Long.MAX_VALUE;
        }
        tVar.a().d(Math.min(j10, TimeUnit.MILLISECONDS.toNanos(i)) + nanoTime);
        try {
            Object obj = new Object();
            while (tVar.q(obj, 8192L) != -1) {
                obj.skip(obj.f25274v);
            }
            if (j10 == Long.MAX_VALUE) {
                tVar.a().a();
                return true;
            }
            tVar.a().d(nanoTime + j10);
            return true;
        } catch (InterruptedIOException unused) {
            if (j10 == Long.MAX_VALUE) {
                tVar.a().a();
                return false;
            }
            tVar.a().d(nanoTime + j10);
            return false;
        } catch (Throwable th) {
            if (j10 == Long.MAX_VALUE) {
                tVar.a().a();
            } else {
                tVar.a().d(nanoTime + j10);
            }
            throw th;
        }
    }

    public static int q(String str, int i, int i10) {
        while (i < i10) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static int r(String str, int i, int i10) {
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11 + 1;
            }
        }
        return i;
    }

    public static l s(ArrayList arrayList) {
        f4.h hVar = new f4.h(1);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            og.b bVar = (og.b) obj;
            ig.b bVar2 = ig.b.e;
            String i10 = bVar.f21983a.i();
            String i11 = bVar.f21984b.i();
            bVar2.getClass();
            hVar.a(i10, i11);
        }
        return new l(hVar);
    }
}