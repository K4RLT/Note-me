package b8;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x9 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2990a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f2991b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f2992c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f2993d;

    static {
        int[] iArr = new int[la.values().length];
        try {
            iArr[la.EXPLORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[la.DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[la.PICK_NOTEBOOK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[la.PUBLISH_FORM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2990a = iArr;
        int[] iArr2 = new int[androidx.lifecycle.o.values().length];
        try {
            iArr2[androidx.lifecycle.o.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[androidx.lifecycle.o.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f2991b = iArr2;
        int[] iArr3 = new int[f.values().length];
        try {
            iArr3[f.MINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f.LIKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[f.EXPLORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f2992c = iArr3;
        int[] iArr4 = new int[o5.values().length];
        try {
            iArr4[o5.TAPES.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[o5.FRAMES.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[o5.ACCESSORIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[o5.NOTEBOOKS.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[o5.STICKERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        f2993d = iArr4;
    }
}
