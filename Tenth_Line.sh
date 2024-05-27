# Read from the file file.txt and output the tenth line to stdout.
# Check if the file exists
if [ -f "file.txt" ]; then
    # Use the 'sed' command to print the 10th line of the file
    sed -n '10p' file.txt
else
    echo "File not found."
fi
