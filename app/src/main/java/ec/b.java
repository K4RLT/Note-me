package ec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f16474u = {new Enum("AD_STORAGE", 0), new Enum("ANALYTICS_STORAGE", 1), new Enum("AD_USER_DATA", 2), new Enum("AD_PERSONALIZATION", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16474u.clone();
    }
}
