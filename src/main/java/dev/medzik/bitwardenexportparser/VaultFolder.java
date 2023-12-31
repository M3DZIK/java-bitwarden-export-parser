package dev.medzik.bitwardenexportparser;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@AllArgsConstructor
public class VaultFolder {
    @NonNull
    public UUID id;
    @NonNull
    public String name;
}
