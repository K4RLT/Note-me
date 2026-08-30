package q7;

import ya.jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ we.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d REMINDER = new d("REMINDER", 0, "scraply_reminders", "on_reminders", 2101);
    public static final d SEASONAL = new d("SEASONAL", 1, "scraply_seasonal", "on_seasonal", 2102);
    public static final d TIP = new d("TIP", 2, "scraply_tips", "on_tips", 2103);
    private final String channelId;
    private final int notificationId;
    private final String prefKey;

    private static final /* synthetic */ d[] $values() {
        return new d[]{REMINDER, SEASONAL, TIP};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jd.a($values);
    }

    private d(String str, int i, String str2, String str3, int i10) {
        this.channelId = str2;
        this.prefKey = str3;
        this.notificationId = i10;
    }

    public static we.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final String getPrefKey() {
        return this.prefKey;
    }
}
