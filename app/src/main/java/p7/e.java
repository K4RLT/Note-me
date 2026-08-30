package p7;
import l.a;
import m.h;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import r0.f1;
import u7.n2;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22444a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f22445b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f22446c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f22447d;
    public static final f1 e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile n2 f22448f;

    /* renamed from: g, reason: collision with root package name */
    public static final pe.n f22449g;

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f22450h;
    public static final ConcurrentHashMap i;

    static {
        b bVar = b.VINTAGE;
        c cVar = new c("mono", "Monospace", bVar, null, 24);
        c cVar2 = new c("special-elite", "Special Elite", bVar, "Special Elite", 16);
        c cVar3 = new c("courier-prime", "Courier Prime", bVar, "Courier Prime", 16);
        c cVar4 = new c("cutive-mono", "Cutive Mono", bVar, "Cutive Mono", 16);
        c cVar5 = new c("nanum-typewriter", "Nanum Pen", bVar, "Nanum Pen Script", 16);
        c cVar6 = new c("vt323", "VT323", bVar, "VT323", 16);
        c cVar7 = new c("xanh-mono", "Xanh Mono", bVar, "Xanh Mono", 16);
        c cVar8 = new c("share-tech-mono", "Share Tech Mono", bVar, "Share Tech Mono", 16);
        b bVar2 = b.HANDWRITING;
        c cVar9 = new c("cursive", "Cursiva", bVar2, null, 24);
        c cVar10 = new c("casual", "Informal", bVar2, null, 24);
        c cVar11 = new c("caveat", "Caveat", bVar2, "Caveat", 16);
        c cVar12 = new c("dancing", "Dancing Script", bVar2, "Dancing Script", 16);
        c cVar13 = new c("patrick-hand", "Patrick Hand", bVar2, "Patrick Hand", 16);
        c cVar14 = new c("pacifico", "Pacifico", bVar2, "Pacifico", 16);
        c cVar15 = new c("indie-flower", "Indie Flower", bVar2, "Indie Flower", 16);
        c cVar16 = new c("shadows-light", "Shadows Into Light", bVar2, "Shadows Into Light", 16);
        c cVar17 = new c("architects", "Architects Daughter", bVar2, "Architects Daughter", 16);
        c cVar18 = new c("gloria", "Gloria Hallelujah", bVar2, "Gloria Hallelujah", 16);
        c cVar19 = new c("satisfy", "Satisfy", bVar2, "Satisfy", 16);
        c cVar20 = new c("sacramento", "Sacramento", bVar2, "Sacramento", 16);
        c cVar21 = new c("great-vibes", "Great Vibes", bVar2, "Great Vibes", 16);
        c cVar22 = new c("kalam", "Kalam", bVar2, "Kalam", 16);
        c cVar23 = new c("amatic", "Amatic SC", bVar2, "Amatic SC", 16);
        c cVar24 = new c("homemade-apple", "Homemade Apple", bVar2, "Homemade Apple", 16);
        b bVar3 = b.TITLES;
        c cVar25 = new c("serif", "Serif", bVar3, null, 24);
        c cVar26 = new c("serif-bold", "Serif Bold", bVar3, null, 24);
        c cVar27 = new c("playfair", "Playfair Display", bVar3, "Playfair Display", 16);
        c cVar28 = new c("cinzel", "Cinzel", bVar3, "Cinzel", 16);
        c cVar29 = new c("cormorant", "Cormorant Garamond", bVar3, "Cormorant Garamond", 16);
        c cVar30 = new c("libre-baskerville", "Libre Baskerville", bVar3, "Libre Baskerville", 16);
        c cVar31 = new c("lora", "Lora", bVar3, "Lora", 16);
        c cVar32 = new c("abril", "Abril Fatface", bVar3, "Abril Fatface", 16);
        c cVar33 = new c("bodoni", "Bodoni Moda", bVar3, "Bodoni Moda", 16);
        c cVar34 = new c("marcellus", "Marcellus", bVar3, "Marcellus", 16);
        c cVar35 = new c("spectral", "Spectral", bVar3, "Spectral", 16);
        b bVar4 = b.MODERN;
        f22444a = qe.h(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, new c("sans", "Sans", bVar4, null, 24), new c("sans-bold", "Sans Bold", bVar4, null, 24), new c("poppins", "Poppins", bVar4, "Poppins", 16), new c("montserrat", "Montserrat", bVar4, "Montserrat", 16), new c("raleway", "Raleway", bVar4, "Raleway", 16), new c("quicksand", "Quicksand", bVar4, "Quicksand", 16), new c("nunito", "Nunito", bVar4, "Nunito", 16), new c("work-sans", "Work Sans", bVar4, "Work Sans", 16), new c("bebas", "Bebas Neue", bVar4, "Bebas Neue", 16), new c("josefin", "Josefin Sans", bVar4, "Josefin Sans", 16), new c("outfit", "Outfit", bVar4, "Outfit", 16), new c("dm-sans", "DM Sans", bVar4, "DM Sans", 16));
        f22445b = new ConcurrentHashMap();
        f22446c = new ConcurrentHashMap();
        f22447d = new ConcurrentHashMap();
        e = new f1(0);
        f22449g = new pe.n(new fg.o(14));
        f22450h = new Handler(Looper.getMainLooper());
        i = new ConcurrentHashMap();
    }

    public static c a(String str) {
        Object obj;
        str.getClass();
        List list = f22444a;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.a(((c) obj).f22431a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        c cVar = (c) obj;
        if (cVar == null) {
            return (c) qe.l.w(list);
        }
        return cVar;
    }

    public static int b() {
        return e.h();
    }

    public static String c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        normalize.getClass();
        Pattern compile = Pattern.compile("\\p{Mn}+");
        compile.getClass();
        String replaceAll = compile.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    public static CountDownLatch d(Context context, String str, String str2) {
        Object kVar;
        ConcurrentHashMap concurrentHashMap = f22447d;
        CountDownLatch countDownLatch = (CountDownLatch) concurrentHashMap.get(str2);
        if (countDownLatch != null) {
            return countDownLatch;
        }
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CountDownLatch countDownLatch3 = (CountDownLatch) concurrentHashMap.putIfAbsent(str2, countDownLatch2);
        if (countDownLatch3 != null) {
            return countDownLatch3;
        }
        try {
            kVar = new m3.c("name=" + str + "&besteffort=false");
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (kVar instanceof pe.k) {
            kVar = null;
        }
        m3.c cVar = (m3.c) kVar;
        if (cVar == null) {
            countDownLatch2.countDown();
            return countDownLatch2;
        }
        ((Handler) f22449g.getValue()).post(new b6.l(context, cVar, new d(str2, countDownLatch2), str, countDownLatch2));
        return countDownLatch2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ed, code lost:
    
        if (r5.equals("special-elite") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fc, code lost:
    
        if (r5.equals("spectral") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r5.equals("playfair") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0204, code lost:
    
        r0 = android.graphics.Typeface.SERIF;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r5.equals("satisfy") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01de, code lost:
    
        r0 = android.graphics.Typeface.create("cursive", 2);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r5.equals("nanum-typewriter") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r5.equals("indie-flower") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r5.equals("dancing") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r5.equals("sacramento") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r5.equals("xanh-mono") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f0, code lost:
    
        r0 = android.graphics.Typeface.MONOSPACE;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (r5.equals("patrick-hand") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r5.equals("libre-baskerville") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        if (r5.equals("pacifico") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        if (r5.equals("homemade-apple") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (r5.equals("cutive-mono") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
    
        if (r5.equals("courier-prime") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
    
        if (r5.equals("vt323") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        if (r5.equals("kalam") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0131, code lost:
    
        if (r5.equals("abril") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
    
        if (r5.equals("lora") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        if (r5.equals("architects") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0160, code lost:
    
        if (r5.equals("share-tech-mono") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        if (r5.equals("great-vibes") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        if (r5.equals("shadows-light") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        if (r5.equals("marcellus") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (r5.equals("gloria") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        if (r5.equals("cormorant") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (r5.equals("cinzel") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        if (r5.equals("caveat") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d2, code lost:
    
        if (r5.equals("bodoni") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01db, code lost:
    
        if (r5.equals("amatic") == false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface e(android.content.Context r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.e.e(android.content.Context, java.lang.String):android.graphics.Typeface");
    }

    public static Typeface f(Context context, String str, boolean z3, boolean z9) {
        int i10;
        context.getClass();
        str.getClass();
        Typeface e8 = e(context, str);
        if (!z3 && !z9) {
            return e8;
        }
        if (z3 && z9) {
            i10 = 3;
        } else if (z3) {
            i10 = 1;
        } else if (z9) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        Typeface create = Typeface.create(e8, i10);
        create.getClass();
        return create;
    }
}
