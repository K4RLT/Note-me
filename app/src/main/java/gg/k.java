package gg;
import l.a;

import a0.f0;
import eb.y;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import wa.x;
import wa.z;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final l f17773a = new Object();

    public static final i a(Number number, String str, String str2) {
        str.getClass();
        str2.getClass();
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str2, -1)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gg.i, java.lang.IllegalArgumentException] */
    public static final i b(Number number, String str) {
        return new IllegalArgumentException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str, -1)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gg.i, java.lang.IllegalArgumentException] */
    public static final i c(cg.d dVar) {
        return new IllegalArgumentException("Value of type '" + dVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + dVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gg.i, java.lang.IllegalArgumentException] */
    public static final i d(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new IllegalArgumentException(str);
    }

    public static final i e(int i, String str, CharSequence charSequence) {
        charSequence.getClass();
        return d(i, str + "\nJSON input: " + ((Object) l(charSequence, i)));
    }

    public static final cg.d f(cg.d dVar, y yVar) {
        dVar.getClass();
        yVar.getClass();
        if (kotlin.jvm.internal.a(dVar.e(), cg.h.f4132b)) {
            x.a(dVar);
            return dVar;
        }
        if (dVar.isInline()) {
            return f(dVar.i(0), yVar);
        }
        return dVar;
    }

    public static final byte g(char c10) {
        if (c10 < '~') {
            return d.f17765b[c10];
        }
        return (byte) 0;
    }

    public static final int h(cg.d dVar, fg.c cVar, String str) {
        Object obj;
        dVar.getClass();
        cVar.getClass();
        str.getClass();
        m(dVar, cVar);
        int d2 = dVar.d(str);
        if (d2 != -3 || !cVar.f16965a.f16988g) {
            return d2;
        }
        z5.h hVar = cVar.f16967c;
        androidx.ink.brush.b bVar = new androidx.ink.brush.b(dVar, 6, cVar);
        hVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f31922v;
        Map map = (Map) concurrentHashMap.get(dVar);
        l lVar = f17773a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(lVar);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = bVar.invoke();
            Object obj3 = concurrentHashMap.get(dVar);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(dVar, obj3);
            }
            ((Map) obj3).put(lVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int i(cg.d dVar, fg.c cVar, String str, String str2) {
        dVar.getClass();
        cVar.getClass();
        str.getClass();
        int h3 = h(dVar, cVar, str);
        if (h3 != -3) {
            return h3;
        }
        throw new IllegalArgumentException(dVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean j(cg.d dVar, fg.c cVar) {
        dVar.getClass();
        cVar.getClass();
        if (!cVar.f16965a.f16984b) {
            List annotations = dVar.getAnnotations();
            if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof fg.r) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void k(f0 f0Var, String str) {
        f0Var.t("Trailing comma before the end of JSON ".concat(str), f0Var.f47b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence l(CharSequence charSequence, int i) {
        String str;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i10 = i - 30;
                int i11 = i + 30;
                if (i10 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i11 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length2 = charSequence.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                sb2.append(charSequence.subSequence(i10, i11).toString());
                sb2.append(str2);
                return sb2.toString();
            }
        }
        return charSequence;
    }

    public static final void m(cg.d dVar, fg.c cVar) {
        dVar.getClass();
        cVar.getClass();
        kotlin.jvm.internal.a(dVar.e(), cg.i.f4134b);
    }

    public static final w n(cg.d dVar, fg.c cVar) {
        dVar.getClass();
        z e = dVar.e();
        if (e instanceof cg.b) {
            return w.f17812z;
        }
        if (kotlin.jvm.internal.a(e, cg.i.f4135c)) {
            return w.f17810x;
        }
        if (kotlin.jvm.internal.a(e, cg.i.f4136d)) {
            cg.d f10 = f(dVar.i(0), cVar.f16966b);
            z e8 = f10.e();
            if (!(e8 instanceof cg.c) && !kotlin.jvm.internal.a(e8, cg.h.f4133c)) {
                throw c(f10);
            }
            return w.f17811y;
        }
        return w.f17809w;
    }

    public static final void o(f0 f0Var, Number number) {
        f0.u(f0Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String p(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        if (b10 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
