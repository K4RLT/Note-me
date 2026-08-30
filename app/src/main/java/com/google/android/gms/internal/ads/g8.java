package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g8 implements p7 {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f6325x = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f6326y = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f6327u = new StringBuilder();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f6328v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final xk0 f6329w = new xk0();

    public static long a(Matcher matcher, int i) {
        long j10;
        String group = matcher.group(i + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r3.equals("{\\an9}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014b, code lost:
    
        if (r3.equals("{\\an9}") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
    
        if (r3.equals("{\\an8}") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        if (r3.equals("{\\an7}") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        if (r3.equals("{\\an3}") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (r3.equals("{\\an2}") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        if (r3.equals("{\\an1}") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0119, code lost:
    
        if (r3.equals("{\\an7}") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0122, code lost:
    
        if (r3.equals("{\\an6}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012b, code lost:
    
        if (r3.equals("{\\an4}") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0132, code lost:
    
        if (r3.equals("{\\an3}") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013a, code lost:
    
        if (r3.equals("{\\an1}") != false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x010a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0143. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r30, int r31, com.google.android.gms.internal.ads.r7 r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g8.w(int, int, com.google.android.gms.internal.ads.r7, byte[]):void");
    }
}
