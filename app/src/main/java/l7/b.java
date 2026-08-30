package l7;

import eg.u;
import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private static final pe.g $cachedSerializer$delegate;
    public static final a Companion;
    public static final b NONE = new b("NONE", 0);
    public static final b CIRCLE = new b("CIRCLE", 1);
    public static final b ROUNDED = new b("ROUNDED", 2);
    public static final b HEART = new b("HEART", 3);
    public static final b ARCH = new b("ARCH", 4);
    public static final b POLAROID = new b("POLAROID", 5);
    public static final b SCRAP = new b("SCRAP", 6);
    public static final b MUSEUM = new b("MUSEUM", 7);
    public static final b GOLD = new b("GOLD", 8);
    public static final b TORN = new b("TORN", 9);
    public static final b STAMP = new b("STAMP", 10);
    public static final b FILM = new b("FILM", 11);
    public static final b TICKET = new b("TICKET", 12);
    public static final b WASHI = new b("WASHI", 13);
    public static final b SCRAP_PREMIUM = new b("SCRAP_PREMIUM", 14);
    public static final b SCRAP_CAMEO = new b("SCRAP_CAMEO", 15);
    public static final b SCRAP_SLOTTED = new b("SCRAP_SLOTTED", 16);
    public static final b SCALLOPED = new b("SCALLOPED", 17);
    public static final b POLAROID_CAMERA = new b("POLAROID_CAMERA", 18);
    public static final b FILM_SINGLE = new b("FILM_SINGLE", 19);
    public static final b TAPED_CORNERS = new b("TAPED_CORNERS", 20);
    public static final b CLASSIC_CORNERS = new b("CLASSIC_CORNERS", 21);
    public static final b REMOTE = new b("REMOTE", 22);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, CIRCLE, ROUNDED, HEART, ARCH, POLAROID, SCRAP, MUSEUM, GOLD, TORN, STAMP, FILM, TICKET, WASHI, SCRAP_PREMIUM, SCRAP_CAMEO, SCRAP_SLOTTED, SCALLOPED, POLAROID_CAMERA, FILM_SINGLE, TAPED_CORNERS, CLASSIC_CORNERS, REMOTE};
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, l7.a] */
    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
        Companion = new Object();
        $cachedSerializer$delegate = pe.a.c(pe.h.f22690u, new fg.o(6));
    }

    private b(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ag.a _init_$_anonymous_() {
        b[] values = values();
        values.getClass();
        return new u(values);
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
