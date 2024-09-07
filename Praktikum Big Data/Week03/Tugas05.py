from collections import defaultdict

# Fungsi untuk membaca file teks


def read_file(file_path):
    with open(file_path, 'r') as file:
        # Baca setiap baris dan pisahkan berdasarkan koma (CSV)
        text_data = [line.strip().split(',') for line in file.readlines()]
    return text_data

# Fungsi untuk memetakan program studi menjadi pasangan (program_studi, 1)


def map_function(text):
    # Ambil kolom kedua (program studi)
    program_studi = text[1].strip()
    return [(program_studi, 1)]

# Fungsi untuk menggabungkan jumlah kemunculan setiap program studi


def reduce_function(mapped_data):
    program_count = defaultdict(int)
    for program_studi, count in mapped_data:
        program_count[program_studi] += count
    return dict(program_count)


# Path ke file teks
file_path = 'minatmhs.csv'  # Sesuaikan dengan lokasi file Anda

# Membaca data dari file
text_data = read_file(file_path)

# Langkah Map: Memetakan setiap program studi ke dalam pasangan (program_studi, 1)
mapped_data = []
for row in text_data[1:]:  # Skip header baris pertama
    mapped_data.extend(map_function(row))

# Langkah Reduce: Menghitung jumlah kemunculan setiap program studi
program_count = reduce_function(mapped_data)

# Menghitung total kemunculan semua program studi
total_occurrences = sum(program_count.values())

# Menghitung rata-rata kemunculan per program studi
average_occurrences = total_occurrences / len(program_count)

# Menampilkan hasil setiap program studi dan jumlah kemunculannya serta rata-rata
print("Program Studi | Jumlah Kemunculan | Rata-rata Kemunculan")
print("-" * 50)
for program, count in program_count.items():
    print(f"{program}: {count} | {(count / total_occurrences):.2%}")

# Menampilkan total dan rata-rata kemunculan
print("\nTotal Kemunculan Semua Program Studi:", total_occurrences)
print(f"Rata-rata Kemunculan Per Program Studi: {average_occurrences:.2f}")
