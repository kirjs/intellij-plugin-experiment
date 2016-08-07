package com.bebe;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class BebeFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(BebeFileType.INSTANCE, "bebe");
    }
}
