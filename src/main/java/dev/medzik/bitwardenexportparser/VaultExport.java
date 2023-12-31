package dev.medzik.bitwardenexportparser;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class VaultExport {
    @NonNull
    public Boolean encrypted;
    @NonNull
    public List<VaultFolder> folders;
    @NonNull
    public List<VaultItem> items;
}
