package wa;

/* loaded from: classes.dex */
public abstract class w {
    public static final Class a(kotlin.jvm.internal.e eVar) {
        eVar.getClass();
        Class a10 = eVar.a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a10;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a10;
            default:
                return a10;
        }
    }
}
