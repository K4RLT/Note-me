package i7;

/* loaded from: classes.dex */
public final class b extends j5.a {
    @Override // j5.a
    public final void a(r5.c cVar) {
        cVar.getClass();
        cVar.o("CREATE TABLE IF NOT EXISTS `stacks` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `orderIndex` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        cVar.o("ALTER TABLE `notebooks` ADD COLUMN `stackId` TEXT DEFAULT NULL");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_notebooks_stackId` ON `notebooks` (`stackId`)");
        long currentTimeMillis = System.currentTimeMillis();
        cVar.o("INSERT OR IGNORE INTO `stacks` (`id`, `title`, `orderIndex`, `createdAt`, `updatedAt`) VALUES ('stack-default', '', 0, " + currentTimeMillis + ", " + currentTimeMillis + ")");
        cVar.o("UPDATE `notebooks` SET `stackId` = 'stack-default' WHERE `stackId` IS NULL");
    }
}
